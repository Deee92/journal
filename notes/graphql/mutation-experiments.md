### Mutating Saleor resolvers with [mutmut](https://mutmut.readthedocs.io/en/latest/)

1. Skip failing tests in original test suite (`test_email_sending_asynchronously(...)`)
2. Running with standard runner gives false positives, run with 
```
mutmut run --paths-to-mutate ./saleor/graphql/<some-type>/resolvers.py --runner pytest
```

#### Results (with backend tests)

\# | file path | mutants | killed | survived
--|------------|---------|--------|---------
1 | ./saleor/saleor/graphql/webhook/resolvers.py | 
2 | ./saleor/saleor/graphql/menu/resolvers.py
3 | ./saleor/saleor/graphql/order/resolvers.py
4 | ./saleor/saleor/graphql/plugins/resolvers.py
5 | ./saleor/saleor/graphql/product/resolvers.py | 41 | 3 | 38
6 | ./saleor/saleor/graphql/translations/resolvers.py
7 | ./saleor/saleor/graphql/app/resolvers.py
8 | ./saleor/saleor/graphql/meta/resolvers.py
9 | ./saleor/saleor/graphql/meta/deprecated/resolvers.py | - | - | -
10 | ./saleor/saleor/graphql/checkout/resolvers.py
11 | ./saleor/saleor/graphql/wishlist/resolvers.py
12 | ./saleor/saleor/graphql/giftcard/resolvers.py | 0 | 0 | 0
13 | ./saleor/saleor/graphql/shipping/resolvers.py | 0 | 0 | 0
14 | ./saleor/saleor/graphql/payment/resolvers.py | 4 | |
15 | ./saleor/saleor/graphql/account/resolvers.py | 47 | |
16 | ./saleor/saleor/graphql/account/deprecated/resolvers.py | - | - | -
17 | ./saleor/saleor/graphql/page/resolvers.py | 8 | 7 | 1
18 | ./saleor/saleor/graphql/discount/resolvers.py | 9 | 2 | 7
**TOTAL** | 16 resolvers | X | Y | Z
