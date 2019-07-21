<?php

namespace Foo;

class Foo {

    /**
     * @psalm-template ExpectedType
     * @psalm-param ExpectedType $expected
     * @psalm-assert =ExpectedType $actual
     */
    public function assertSame($expected, $actual)
    {
    }

    /**
     * @psalm-template RealInstanceType of object
     * @psalm-param class-string<RealInstanceType>|null $classOrInterface
     * @psalm-return ObjectProphecy<RealInstanceType>
     */
    protected function prophesize($classOrInterface = null): ObjectProphecy
    {

    }
}


