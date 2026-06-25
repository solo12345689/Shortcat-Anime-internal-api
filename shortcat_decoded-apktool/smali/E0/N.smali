.class public abstract LE0/N;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Landroidx/compose/ui/viewinterop/b;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    new-instance v0, LE0/M;

    .line 2
    .line 3
    invoke-direct {v0}, LE0/M;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/N$a;

    .line 7
    .line 8
    invoke-direct {v1, p1}, LE0/N$a;-><init>(Landroidx/compose/ui/viewinterop/b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, LE0/M;->i(Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LE0/U;

    .line 15
    .line 16
    invoke-direct {v1}, LE0/U;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, LE0/M;->j(LE0/U;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroidx/compose/ui/viewinterop/b;->setOnRequestDisallowInterceptTouchEvent$ui_release(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
