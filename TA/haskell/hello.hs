-- Hello, Haskell!
{-
Multiline hello Haskell
-}

import Data.List
import System.IO

-- Int -2^63 to 2 ^63
maxInt = maxBound :: Int
minInt = minBound :: Int

-- Integer
-- as big as possible in memory
-- Float, Double, Bool(True False), Char, Tuple

always5 :: Int
always5 = 5

-- Lists are homogenous
sumOfNums = sum [1..1000] -- list
-- other operators + - / *
-- prefix and infix operator mod
-- parens around negative
-- && || not
-- :t sqrt
-- :t (+)
-- :t truncate

sumWithNeg = 5 + (-4)
modNum = mod 5 4
modNumAlso = 5 `mod` 4

num9 = 9 :: Int
sqrt9 = sqrt(fromIntegral num9)

primeNums = [3,5,7,11]
primeNums2 = primeNums ++ [13,17,19]

-- combine numbers to list
favNums = 2 : 7 : 21 : 66 :[] -- end of list

multiList = [[1,2,3], [4,5,6]]

-- length primeNums
-- reverse primeNums
-- null primeNums (is list empty)
-- get from index primeNums !! 1 (gets second element)
-- head primeNums
-- last primeNums
-- init
-- take 3 primeNums
-- drop 3 primeNums
-- 7 `elem` primeNums
-- maximum primeNums
-- minimum primeNums

newList = [2,3,5]
productPrimes = product newList

oneToSix = [1..6]
sumOneToSix = sum oneToSix
productOneToSix = product oneToSix
evenList = [2,4..20]
charList = ['A','C'..'Z']
infiniteList = [10,20..] -- infinite list, lazy evaluation
many2s = take 10 (repeat 2) -- generates 10 2s
many3s = replicate 10 3 -- generates 10 3s

-- cycle
-- <- filtering, | (such that)

listTimes3 = [x * 3 | x <- [1..10], x * 3 <= 50]
moreFiltering = [x | x <- [1..500], x `mod` 13 == 0, x `mod` 9 == 0]

sortedList = sort [452, 1253, 124, 12, 123, 1]
sumOfLists = zipWith (+) [12, 5, 1,5, 6] [1, 3, 6, 5, 7]

-- filter (>5)
-- takeWhile (<=20) -- lazy evaluation
-- operation on each item of list 

-- function definition
doubleMe x = x + x
-- no parameters, immutable, interchangeable
mario = "It's a-me, Mario!"
marioPuzo = mario == "puzo"
-- multiple parameters
funkyFunc x y = (x * 2) + (y * 2)
-- reusing functions in other functions
funkierFunc x y = doubleMe x + doubleMe y

{- if and (mandatory) else in Haskell,
a function or expression must always return something,
void is not an option
-}

doubleSmallerNumber x = if x > 100 then x else x*2

{- Function naming: can have ',
cannot start with uppercase 
-}
validFunctionNameWithApostrophe' x = if x `mod` 2 == 0 then x * 7 else x

-- Lists
-- Strings are lists of characters
-- Joining two lists together
listOne = [1,3,4,6]
listTwo = [8,9,90,10]
joinedList = listOne ++ listTwo
-- Adding to beginning of list with :
addToStart = 6 : listOne
-- List indexing
firstElem = joinedList !! 0
listHead = head joinedList
listLast = last joinedList
listTail = tail joinedList
listInit = init joinedList
