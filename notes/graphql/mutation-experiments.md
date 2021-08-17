### Mutating Saleor resolvers with [mutmut](https://mutmut.readthedocs.io/en/latest/)

1. Skip failing tests in original test suite (`test_email_sending_asynchronously(...)`)
2. Running with standard runner gives false positives, run with 
```
mutmut run --paths-to-mutate ./saleor/graphql/<some-type>/resolvers.py --runner pytest
```

#### Results (with backend tests)

\# | File path | Mutants | Killed | Survived | Surviving mutant IDs | Surviving mutants caught with test queries?
--|------------|---------|--------|----------|----------------------|--------------------------------------------
1 | ./saleor/saleor/graphql/webhook/resolvers.py | 12 | 11 | 1 | ID: 5 | No
2 | ./saleor/saleor/graphql/menu/resolvers.py | 9 | 1 | 8 | ID: 1 - 8 | No
3 | ./saleor/saleor/graphql/order/resolvers.py | 20 | 7 | 13 | ID: 1 - 11, 13 - 14 | No
4 | ./saleor/saleor/graphql/plugins/resolvers.py | 16 | 16 | 0 | - | -
5 | ./saleor/saleor/graphql/product/resolvers.py | 41 | 38 | 3 | ID: 13, 19, 23 | No
6 | ./saleor/saleor/graphql/translations/resolvers.py | 0 | 0 | 0 | - | -
7 | ./saleor/saleor/graphql/app/resolvers.py | 2 | 2 | 0 | - | -
8 | ./saleor/saleor/graphql/meta/resolvers.py | 13 | 12 | 1 | ID: 7 | No
9 | ./saleor/saleor/graphql/meta/**deprecated**/resolvers.py | - | - | - | - | -
10 | ./saleor/saleor/graphql/checkout/resolvers.py | 7 | 5 | 2 | ID: 1 - 2 | No
11 | ./saleor/saleor/graphql/wishlist/resolvers.py | 3 | 0 | 3 | ID: 1 - 3 | No
12 | ./saleor/saleor/graphql/giftcard/resolvers.py | 0 | 0 | 0 | - | -
13 | ./saleor/saleor/graphql/shipping/resolvers.py | 0 | 0 | 0 | - | -
14 | ./saleor/saleor/graphql/payment/resolvers.py | 4 | 0 | 4 | ID: 1 - 4 | No
15 | ./saleor/saleor/graphql/account/resolvers.py | 47 | 27 | 20 | ID: 1-8, 17-18, 21, 23, 25-26, 33-38 | No
16 | ./saleor/saleor/graphql/account/**deprecated**/resolvers.py | - | - | - | - | -
17 | ./saleor/saleor/graphql/page/resolvers.py | 8 | 7 | 1 | ID: 2 | No
18 | ./saleor/saleor/graphql/discount/resolvers.py | 9 | 2 | 7 | ID: 1 - 7 | No
**TOTAL** | (13 resolvers) | 191 | 128 (MS: 67%) | 63 | - | No
