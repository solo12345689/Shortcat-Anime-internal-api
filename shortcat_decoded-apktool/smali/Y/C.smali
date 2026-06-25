.class public abstract LY/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:LY/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY/C;->a:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, LY/C$a;

    .line 9
    .line 10
    invoke-direct {v0}, LY/C$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY/C;->b:LY/M;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(LY/d;LY/y;)LY/x;
    .locals 6

    .line 1
    new-instance v0, LY/B;

    .line 2
    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-object v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, LY/B;-><init>(LY/y;LY/d;LZd/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final b(LY/d;LY/y;)LY/y1;
    .locals 6

    .line 1
    new-instance v0, LY/B;

    .line 2
    .line 3
    const/4 v4, 0x4

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-object v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, LY/B;-><init>(LY/y;LY/d;LZd/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final synthetic c()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/C;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
