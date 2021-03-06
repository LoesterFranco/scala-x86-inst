package com.scalaAsm.x86
package Instructions
package x87

// Description: Check pending unmasked floating-point exceptions
// Category: general/control

trait FWAIT extends InstructionDefinition {
  val mnemonic = "FWAIT"
}

object FWAIT extends ZeroOperands[FWAIT] with FWAITImpl

trait FWAITImpl extends FWAIT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x9B
      }
}
