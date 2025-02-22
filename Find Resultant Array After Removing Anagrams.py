#CODE LINK : https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
class Solution(object):
    def removeAnagrams(self, words):
        for i in range(len(words)-1,0,-1):
            if(sorted(words[i]) == sorted(words[i-1])):
                words.pop(i)
        return words
