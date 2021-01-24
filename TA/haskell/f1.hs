import Data.Char -- for isAlpha

-- Fibonacci

-- with if then else; VERY slow for fib 73
fibIf :: Integer -> Integer
fibIf 0 = 0
fibIf 1 = 1
fibIf n = fibIf (n - 1) + fibIf (n - 2)

-- with guards; VERY slow for fib 73
fibGuard :: Integer -> Integer
fibGuard n
  | n == 0 = 0
  | n == 1 = 1
  | n > 1 = fibGuard (n - 1) + fibGuard (n - 2)
  | otherwise = 0

-- fibonacci sequence - lazy infinite list
fib = 0 : 1 : zipWith (+) fib (tail fib)
getFib n = fib !! n

--------------------------------------------------

-- Rovarsprak

vowels = ['a', 'e', 'i', 'o', 'u', 'y']

-- encoding: old method
rovar :: Char -> [Char]
rovar c
  | c `elem` vowels = c : []
  | otherwise = c : 'o' : c : []

sprakify s = concat [ rovar c | c <- s ]

isVowel :: Char -> Bool
isVowel c
  | c `elem` vowels = True
  | otherwise = False

-- encoding: from kattis
rovarsprak :: String -> String
rovarsprak [] = []
rovarsprak (c : rest)
  | isVowel c = c : rovarsprak rest
  | otherwise = c : 'o' : (c : rovarsprak rest)
  
-- decoding: from kattis
karpsravor :: String -> String
karpsravor [] = []
karpsravor (c : rest)
  | isVowel c = c : karpsravor rest
  | otherwise = c : karpsravor (tail (tail rest))

--------------------------------------------------
  
-- Message length

-- Convert all non-alphabetic characters to space
convert :: Char -> Char
convert c
  | isAlpha c = c
  | otherwise = ' '

-- Generate refactored string with only alphabetical characters and spaces
refactorString :: [Char] -> [Char]
refactorString s = [ convert c | c <- s ] 

wordLength :: String -> Int
wordLength s = length s

-- Find the length of a message, divided by the number of words
messageLength :: String -> Double
messageLength s = fromIntegral (sum [ wordLength w | w <- words (refactorString s)]) / fromIntegral (length (words (refactorString s)))

--------------------------------------------------

-- List shift

