-- A do block, indentation is key! It is an alternative to semicolons.

someNum = 5 :: Int

main = do putStrLn "What is 6 + 6?"
          x <- readLn
          if x == 12
            then putStrLn "Correct!"
            else putStrLn "Wot!"
          print (someNum)

