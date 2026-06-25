.class public final Lcom/facebook/react/g$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/g;->h(Lj7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/g;

.field final synthetic b:Lj7/a;

.field final synthetic c:Lcom/facebook/react/H;


# direct methods
.method constructor <init>(Lcom/facebook/react/g;Lj7/a;Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/g$c;->a:Lcom/facebook/react/g;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/g$c;->b:Lj7/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/g$c;->c:Lcom/facebook/react/H;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/g$c;->a:Lcom/facebook/react/g;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/g$c;->b:Lj7/a;

    .line 9
    .line 10
    invoke-static {v0, p1, v1}, Lcom/facebook/react/g;->e(Lcom/facebook/react/g;Lcom/facebook/react/bridge/ReactContext;Lj7/a;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/facebook/react/g$c;->c:Lcom/facebook/react/H;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Lcom/facebook/react/H;->l0(Lcom/facebook/react/z;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
