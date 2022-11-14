@smoke
  Feature: social
    Scenario: user opens facebook link
      Given user in home page2
      When user click facebook icon
      Then new tab with facebook should be opened

    Scenario: user opens twitter link
      Given user in home page2
      When user click twitter icon
      Then new tab with twitter should be opened

      Scenario: user open rss
        Given user in home page2
        When user click rssicon
        Then new tab with rss shoud be opened

        Scenario: user open youtube
          Given user in home page2
          When user click youtubeicon
          Then new tab with youtube should be opened
