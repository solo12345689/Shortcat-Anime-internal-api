.class public final LGf/K$a;
.super LZd/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGf/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, LZd/f;->S:LZd/f$b;

    new-instance v1, LGf/J;

    invoke-direct {v1}, LGf/J;-><init>()V

    .line 3
    invoke-direct {p0, v0, v1}, LZd/b;-><init>(LZd/i$c;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LGf/K$a;-><init>()V

    return-void
.end method

.method public static synthetic c(LZd/i$b;)LGf/K;
    .locals 0

    .line 1
    invoke-static {p0}, LGf/K$a;->d(LZd/i$b;)LGf/K;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(LZd/i$b;)LGf/K;
    .locals 1

    .line 1
    instance-of v0, p0, LGf/K;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LGf/K;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method
