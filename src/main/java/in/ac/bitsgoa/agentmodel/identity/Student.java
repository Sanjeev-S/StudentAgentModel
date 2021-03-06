/**
 * Copyright (c) 2017
 * Sanjeev S, Prasad Talasila
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met: 1) Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the following
 * disclaimer. 2) Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided
 * with the distribution. 3) Neither the name of the Qulice.com nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package in.ac.bitsgoa.agentmodel.identity;

/**
 * This specifies the agent.
 * @author Sanjeev Suresh (f2013495@goa.bits-pilani.ac.in)
 * @author Prasad Talasila (tsrkp@goa.bits-pilani.ac.in)
 * @version $Id$
 * @since 0.0.1
 */
public class Student implements Identity {
    /**
     * Just a message.
     */
    private final String message;
    /**
     * Constructor.
     * @param message Just a message to print.
     */
    public Student(final String message) {
        this.message = message;
    }
    /**
     * Prints the message.
     * @return Returns the message.
     */
    public final String printMessage() {
        System.out.println(this.message);
        return this.message;
    }
    /**
     * Sets the context.
     */
    public final void setContext() {
        System.out.println("Not Implemented yet");
        System.out.println(this.message);
    }
}
