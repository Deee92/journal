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
          }
        }
      }
    }
  }
}

query Third {
  categories (first: 12) {
    edges {
      node {
        name
        products(first: 15, channel: "default-channel") {
          edges {
            node {
              name
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
```

▶️ [To demo playground](https://demo.saleor.io/graphql/)
