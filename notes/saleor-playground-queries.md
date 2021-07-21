```
query First {
  product(id: "UHJvZHVjdDoxMTU=", channel: "default-channel") {
    id
    name
    collections {
      name
      id
    }
  }
}

query Second {
  products(first: 10, channel: "default-channel") {
    edges {
      node {
        id
        name
        weight {
          value
          unit
        }
        category {
          name
          backgroundImage {
            alt
          }
        }
        collections {
          name
        }
        productType {
          name
          hasVariants
        }
        variants {
          name
          weight {
            value
            unit
          }
        }
      }
    }
  }
}

query Third {
  categories (first: 15) {
    edges {
      node {
        name
        products(first: 15, channel: "default-channel") {
          edges {
            node {
              name
              id
            }
          }
        }
      }
    }
  }
}

query Fourth {
  categories (first: 15) {
    totalCount
    edges {
      node {
        name
      }
    }
  }
}

query Fifth {
  product(id: "UHJvZHVjdDo2MQ==", channel: "default-channel") {
    id
    name
    category {
      name
    }
    variants {
      name
      product {
        name
      }
      weight {
        value
      }
    }
  }
}
```

### [Authentication](https://docs.saleor.io/docs/developer/users#authentication)

```
mutation Auth {
  tokenCreate(email: "admin@example.com", password: "admin") {
    token
    refreshToken
    csrfToken
    user {
      email
    }
    errors {
      field
      message
    }
  }
}

query First {
  customers(first: 10) {
    edges {
      node {
        firstName
        lastName
      }
    }
  }
}
```

### [Resolution issues](https://github.com/mirumee/saleor/issues/4837)
```
query GitHubIssue4837 {	
  products(first: 10, filter: {
    attributes: {slug: "abv", values: "51"}
  }){
  	edges {
      node {
        id
        name
      }
    }
  }
}
```

### Attributes
```
query AnotherIssue {	
  products(first: 10, filter: {
    attributes: {slug: "flavor", values: "apple"}
  }){
  	edges {
      node {
        id
        name
      }
    }
  }
}

query ProductsAndAttributes {
  products(first:50) {
    edges {
      node {
        name
        id
        attributes {
          attribute {
            slug
          }
          values {
            slug
            value
            name
          }
        }
      }
    }
  }
}

query AllAttributeNames {
  attributes(first: 100) {
    edges {
      node {
        slug
      }
    }
  }
}


query AppleJuiceAttributes {
  product(id: "UHJvZHVjdDo3Mg==") {
    name
    attributes {
      attribute {
        slug
      }
      values {
        name
        value
        slug
      }
    }
  }
}

```

▶️ [To demo playground](https://demo.saleor.io/graphql/)
