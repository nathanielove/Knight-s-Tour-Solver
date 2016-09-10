
# WHY DO WE HAVE TO USE LISP

> The Original Letter to Course Coordinators of CZ3005 Artificial Intelligence
>
> Author: Nathaniel
>
> Date: 14 Feb 2016

Hi,

I am a student of CZ3005 Artificial Intelligence. I have a really simple question: WHY DO WE HAVE TO USE LISP?

This language is almost 60 years old. Yes, it was once popular among AI researchers like 30 years ago. But that was because back at that time, more advanced languages like Python or Ruby weren’t even born yet, and those people simply didn’t have any other choice than LISP.

But now, things are totally different. Although I wasn’t born in 1958, at least I can learn from history books about how much technologies have changed in the past half a century. So, why do we still have to learn LISP, a dead language that we won’t ever use again after these assignments, while there are much wiser options, like Python, Perl, or even C++.

Honestly, I didn’t even bother to look into the AIMS framework in LISP at all. A dead language is dead. I’d rather not waste my time on something that I will never use again in the industry. What I did instead was to spend slightly more than two hours writing a solver framework in Java and start translating my code to Lisp. Then, that’s where all the problems came in. Let me briefly summarize the problems I discovered when I was doing the translation:

1. **LISP doesn’t have a powerful and convenient standard library** as Java or Python does. Without the infrastructures like Set, Dictionary, Comparator, etc, the performance of the LISP program is like hundreds times slower compared to my Java code, although they implement exactly the same algorithm. Also this makes it so painful to write in Lisp.
2. **The syntax is disgusting and the built-in function names just don’t make any sense.** Although this might sound like personal preferences, I'd bet anyone who don’t hate themselves wouldn’t find the experience with Lisp entertaining. 
3. **The documentation quality is horrible, and there is no active developer community.** I tried the official docs on Lisp Works, and the tutorial on TutorialsPoint.com. I also read some answers on stackoverflow related to Lisp. Well, they all suck. I still have too many things that I don't understand in my mind and none of the materials really helped.
4. **There is no convenient development environment.** I’m sure you are familiar with IntelliJ IDEA and other well-known IDEs made by JetBrains such as PyCharm, WebStorm, RubyMine (This is not an advertisement; I just like their product). If you wanna take a look into the free tier, there are Eclipse, NetBeans, etc. BUT, is there one for Lisp? NO. Companies like JetBrains don’t make an IDE for Lisp for some reasons - most likely because no one actually uses LISP for serious stuff.
5. A large percentage of the libraries, frameworks, and references of the Google search results point to some “.edu” domain. Is it a sign that the undergrad level courses are too obsolete nowadays? Or seriously, **how many researchers in AI still use Lisp for their daily research?** 

Well to address some points that might be used to defend the idea of using Lisp:

1. *"Lisp is not dead, there are many researchers using Lisp"* - Well, maybe it’s not completely dead, but its audiences are only limited to a few hobbyists, as well as those who started really early in programming but couldn't follow up with fast-evolving technologies. It's OK for the first group of people, because LISP reminds them of their good old days in college or as a young professional, but it's stupid to be the second kind. People like that can't survive in this industry.
2. *"University is about learning. It’s not just a training to prepare the students for the industry."* - Yes that's exactly the point. Does LISP facilitate our learning process in any way? Completely no, and even worse, it makes us hate learning whatever concept you are trying to teach us.
3. *"The language doesn’t matter. What we care is the concept, which is universal."* - The language DOES matter, because our experience DOES matter, and our time DOES matter. We wouldn’t have to suffer so much, nor wouldn’t we have to spend so much time, if we’re allowed to use any advanced language like Python. Also, please, if the language really, as quoted, "doesn’t matter", why do you limit our choice to Lisp?
4. *"There is a AIMA framework in Lisp already"* - Yes there is, but the AIMA framework is also available in Java and Python. Also, the documentation of the LISP-version AIMA is so poor. I read about it, and I only understand roughly what it does, but got completely no idea how to use it. Or, what’s wrong with solving this problem from scratch? It’s not difficult at all if we use Python or Java.

OK, so far I’ve spent a whole day yesterday and the first 3 hours of Valentine’s Day converting my Java code into Lisp, and I finally made it work - not by learning from proper documentations, but being forced to do experiments on compiler and figure out the rules by myself. Btw, the word "experiment" doesn't have to sound smart all the time. It's really a stupid thing that you made us to do. Physicists and biologists do experiments because they are trying to figure out the rules set by Mother Nature and not documented by anyone before. If Mother Nature ever wrote a complete and proper documentation on the physics rules and parameters, it'd be stupid to do experiments ever again.

 Also it’s not like I don’t have anything better to do on Valentine's Day. Even assuming I didn’t have a girlfriend, I’d so like to try out Angular 2 (the front-end Javascript framework developed by Google), which has just been release in public Beta, if I didn’t have to spend so much time on the assignment. 

 Finally, in case you are interested, here’s the [repository on GitHub](https://github.com/nathanielove/Knight-s-Tour-Solver) that contains my solution in Java. I didn’t have the time to write documentation for it yet, but the code itself is quite easy to understand. It is extendable and provides a generic framework for this problem.

Thank you for reading this long email, and Happy Valentine’s Day!

Best regards

Nathaniel
