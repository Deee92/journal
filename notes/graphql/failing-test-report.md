## Failing tests generated with (FE + BE) test queries

\# | Test class | Cause
---|------------|------
1  | Q02ee2c02ecd75462a8d38a97bbb0b3a2Test | Invalid ID specified
2  | Q040c6e4e04ac5b3898fbb7e137f48c5bTest | File "/app/saleor/graphql/core/validators.py", line 21, graphql.error.base.GraphQLError: Argument 'id' cannot be combined with 'slug'
3  | Q1b4242fb38e4582092a534aa5ec2e726Test | Invalid ID specified
4  | Q1d007d7ebafe51c29924c963f47d90acTest | File "/app/saleor/graphql/core/fields.py", line 144, graphql.error.base.GraphQLError: You must provide a `first` or `last` value to properly paginate the `products` connection.
5  | Q1e2e9a0ccf2853079392e533a3f40d54Test | Invalid ID specified
6  | Q26e3a3e69dd55cc48708670dd6986d22Test | File "/app/saleor/graphql/core/validators.py", line 21, graphql.error.base.GraphQLError: Argument 'id' cannot be combined with 'slug'
7  | Q33fa0d62bf335516832a6159d51113caTest | File "/app/saleor/graphql/core/validators.py", line 27, graphql.error.base.GraphQLError: At least one of arguments is required: 'id', 'slug'.
8  | Q37c566ef09f85e6f993aabd862adaf2eTest | File "/app/saleor/graphql/utils/sorting.py", line 62, graphql.error.base.GraphQLError: You must provide either `field` or `attributeId` to sort the products.
9  | Q46dedc316d0d5bd4ab01ec7a91a1651cTest | File "/app/saleor/graphql/core/validators.py", line 27, graphql.error.base.GraphQLError: At least one of arguments is required: 'id', 'name', 'slug'.
10 | Q4a7aad8d77d453908dcc928e7e26971cTest | Could not resolve to a node with the global id list of '['Q29sbGVjdGlvbjo5OQ==']'
11 | Q4d26735340dc56a6999b355182b06b5dTest | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6Mzgz']'.
12 | Q5f4ed61a2f535428b259c4b4306d9e97Test | File "/app/saleor/graphql/core/validators.py", line 27, graphql.error.base.GraphQLError: At least one of arguments is required: 'id', 'sku'.
13 | Q60e6e8d6b7bc5a8489f0043e09faa43aTest | File "/app/saleor/webhook/payloads.py", line 354, UnboundLocalError: local variable 'payload' referenced before assignment
14 | Q6fae03f0f09f59b492b38193c0cfb27bTest | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6NTUy']'.
15 | Q70fba6712dea5c6198a9ee31142d3f84Test | saleor.account.models.User.DoesNotExist: User matching query does not exist.
16 | Q7df8d505b7695a369cad2f870377dacaTest | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6NTQx']'.
17 | Q8e3771f0b19a54f795ae003854c03c75Test | File "/app/saleor/graphql/product/filters.py", line 67, ValueError: Unknown attribute name: 'new_attr'
18 | Q8e772b7c1c9851a4b016da0eefb15e42Test | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6NTY3']'.
19 | Q8fb6e2e8f97452789906e569ea1a89e2Test | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6Mzc4']'.
20 | Q1823aa842e0f50659cc32b0eecbcbf0cTest |  File "/app/saleor/graphql/core/validators.py", line 21, graphql.error.base.GraphQLError: Argument 'id' cannot be combined with 'slug'
21 | Q2329a7e7d65050aca7d32343fffa663dTest | Could not resolve to a node with the global id list of '['Q29sbGVjdGlvbjoxMDk=']'.
22 | Q322cb60dc1c953e8a3de994d5bc20e65Test | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6MTk1']'.
23 | Q5617d95b6cbf55d38067bbf9cdfc295cTest | Could not resolve to a node with the global id list of '['Q29sbGVjdGlvbjo5NQ==']'.
24 | Q5640d6898a34526ca4236473c856352bTest | File "/app/saleor/webhook/payloads.py", line 354, UnboundLocalError: local variable 'payload' referenced before assignment
25 | Q8308e5257c395156bdd97f4d0fa5b5f5Test | File "/app/saleor/graphql/core/validators.py", line 21, graphql.error.base.GraphQLError: Argument 'id' cannot be combined with 'sku'
26 | Q87f885ea134c5ef4a751dcb494e64159Test |  File "/app/saleor/graphql/account/schema.py", line 220 -> File "/app/saleor/graphql/account/resolvers.py", line 56, ValueError: not enough values to unpack (expected 2, got 1)
27 | Q9247985ee4f656f1a0282760777529a4Test | File "/app/saleor/graphql/core/validators.py", line 21, graphql.error.base.GraphQLError: Argument 'id' cannot be combined with 'name'
28 | Q967a30d6f3dd5b9f8a144325ba204dc1Test | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6Mzc3']'.
29 | Q97f3fce5d3ef50d38ebaf7776ec06fc1Test | File "/app/saleor/graphql/core/validators.py", line 21, graphql.error.base.GraphQLError: Argument 'id' cannot be combined with 'slug'
30 | Q99c494590ec35fa9bc1582ff86b44f74Test | Could not resolve to a node with the global id list of '['Q29sbGVjdGlvbjo4NQ==']'.
31 | Qac8ca731de585c579b627fd0512410eaTest | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6Mzc2']'.
32 | Qbad51bcec5ab54ebaf1d7f2a4831faa1Test | File "/app/saleor/graphql/core/validators.py", line 27, graphql.error.base.GraphQLError: At least one of arguments is required: 'id', 'slug'.
33 | Qbb572826bf4b592a82832451cff36086Test | "Invalid ID specified"
34 | Qc2035f116a6458298a9cec4331845639Test | File "/app/saleor/graphql/core/validators.py", line 27, graphql.error.base.GraphQLError: At least one of arguments is required: 'id', 'slug'.
35 | Qc948967bece95c89901be904b2bc7852Test | File "/app/saleor/webhook/payloads.py", line 354, UnboundLocalError: local variable 'payload' referenced before assignment
36 | Qe52860ae205254929b190c4745ed5c18Test | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6Mzcw']'.
37 | Qe871af9544f05930b03d7c0a667eff5bTest | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6Mzg0']'
38 | Qf14bde7ff6125f1ab407239904881c9dTest | Could not resolve to a node with the global id list of '['Q2F0ZWdvcnk6NTQ1']'.
