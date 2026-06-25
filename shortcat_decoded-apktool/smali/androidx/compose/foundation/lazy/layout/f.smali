.class public abstract Landroidx/compose/foundation/lazy/layout/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(IIZ)F
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/layout/f;->b(II)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 p1, 0x64

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    add-float/2addr p0, p1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/layout/f;->b(II)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static final b(II)F
    .locals 0

    .line 1
    mul-int/lit16 p0, p0, 0x1f4

    .line 2
    .line 3
    add-int/2addr p1, p0

    .line 4
    int-to-float p0, p1

    .line 5
    return p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lie/a;LF/C;Lz/q;ZZLY/m;I)Landroidx/compose/ui/e;
    .locals 8

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result p6

    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    const/4 p6, -0x1

    .line 8
    const-string v0, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)"

    .line 9
    .line 10
    const v1, 0x3fc8fe51

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p7, p6, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    .line 17
    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    move-object v5, p3

    .line 21
    move v6, p4

    .line 22
    move v7, p5

    .line 23
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;-><init>(Lie/a;LF/C;Lz/q;ZZ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v2}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {}, LY/w;->L()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-static {}, LY/w;->T()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-object p0
.end method
