package com.agilogy.fpintro.messages.app

import com.agilogy.fpintro.messages.domain.{Emoji, MessageContent}

object MessagesService {

  def addReactionsToGoodMorning(repository: MessagesRepository): Unit = {
    val goodMorning = MessageContent("Good mooorning FP laaand!")
    val message     = repository.selectByContent(goodMorning)
    repository.update(message.addReaction(Emoji.Sun).addReaction(Emoji.Tada))
  }

}
