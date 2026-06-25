.class public final LT1/w$a;
.super LT1/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT1/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lkotlin/jvm/functions/Function2;

.field private final b:LGf/x;

.field private final c:LT1/D;

.field private final d:LZd/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;LGf/x;LT1/D;LZd/i;)V
    .locals 1

    .line 1
    const-string v0, "transform"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callerContext"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, LT1/w;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LT1/w$a;->a:Lkotlin/jvm/functions/Function2;

    .line 21
    .line 22
    iput-object p2, p0, LT1/w$a;->b:LGf/x;

    .line 23
    .line 24
    iput-object p3, p0, LT1/w$a;->c:LT1/D;

    .line 25
    .line 26
    iput-object p4, p0, LT1/w$a;->d:LZd/i;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()LGf/x;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/w$a;->b:LGf/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/w$a;->d:LZd/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LT1/D;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/w$a;->c:LT1/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/w$a;->a:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method
