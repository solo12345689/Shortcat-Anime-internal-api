.class public final Lcom/facebook/react/devsupport/o0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/o0$a;
    }
.end annotation


# static fields
.field private static final b:Lcom/facebook/react/devsupport/o0$a;


# instance fields
.field private final a:Ldg/A;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/o0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/o0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/o0;->b:Lcom/facebook/react/devsupport/o0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldg/A;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/devsupport/o0;->a:Ldg/A;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lc7/h;)V
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/facebook/react/devsupport/o0;->b:Lcom/facebook/react/devsupport/o0$a;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/o0$a;->a(Lcom/facebook/react/devsupport/o0$a;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ldg/C$a;

    .line 18
    .line 19
    invoke-direct {v0}, Ldg/C$a;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ldg/C$a;->b()Ldg/C;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/facebook/react/devsupport/o0;->a:Ldg/A;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lcom/facebook/react/devsupport/o0$b;

    .line 37
    .line 38
    invoke-direct {v0, p2}, Lcom/facebook/react/devsupport/o0$b;-><init>(Lc7/h;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Ldg/e;->O1(Ldg/f;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
