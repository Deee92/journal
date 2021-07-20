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

▶️ [To demo playground](https://demo.saleor.io/graphql/)
