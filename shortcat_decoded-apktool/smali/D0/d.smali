.class public abstract LD0/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(LK0/I0;)LK0/I0;
    .locals 0

    .line 1
    invoke-static {p0}, LD0/d;->b(LK0/I0;)LK0/I0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(LK0/I0;)LK0/I0;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LD0/d$a;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LD0/d$a;-><init>(Lkotlin/jvm/internal/N;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, LK0/J0;->d(LK0/I0;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, LK0/I0;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final c(LD0/a;LD0/b;)LK0/j;
    .locals 1

    .line 1
    new-instance v0, LD0/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LD0/c;-><init>(LD0/a;LD0/b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
