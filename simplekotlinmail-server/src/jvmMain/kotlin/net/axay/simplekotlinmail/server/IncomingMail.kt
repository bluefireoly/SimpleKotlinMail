package net.axay.simplekotlinmail.server

import org.simplejavamail.api.email.Email
import org.subethamail.smtp.MessageContext

/**
 * This class represents an incoming mail, received by a SMTP server.
 */
data class IncomingMail(
    val envelopeFrom: String,
    val recipients: List<String>,
    val email: Email,
    val context: MessageContext
)
