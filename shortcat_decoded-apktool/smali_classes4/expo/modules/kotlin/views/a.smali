.class public abstract Lexpo/modules/kotlin/views/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lpc/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpc/b;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "type"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/kotlin/views/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/views/a;->b:Lpc/b;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lpc/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/a;->b:Lpc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract c(Lcom/facebook/react/bridge/Dynamic;Landroid/view/View;LUb/d;)V
.end method
