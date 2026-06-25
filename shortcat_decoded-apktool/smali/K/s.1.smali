.class public abstract LK/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LK/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LK/s$b;->b:LK/s$b;

    .line 2
    .line 3
    invoke-static {v0}, LK/s;->a(Lkotlin/jvm/functions/Function1;)LK/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LK/s$c;

    .line 8
    .line 9
    invoke-direct {v1, v0}, LK/s$c;-><init>(LK/r;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, LK/s;->a:LK/r;

    .line 13
    .line 14
    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function1;)LK/r;
    .locals 1

    .line 1
    new-instance v0, LK/s$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LK/s$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b()LK/r;
    .locals 1

    .line 1
    sget-object v0, LK/s;->a:LK/r;

    .line 2
    .line 3
    return-object v0
.end method
