.class LH1/k$c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH1/k$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK1/a;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:LH1/k$c;


# direct methods
.method constructor <init>(LH1/k$c;LK1/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH1/k$c$a;->c:LH1/k$c;

    .line 2
    .line 3
    iput-object p2, p0, LH1/k$c$a;->a:LK1/a;

    .line 4
    .line 5
    iput-object p3, p0, LH1/k$c$a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LH1/k$c$a;->a:LK1/a;

    .line 2
    .line 3
    iget-object v1, p0, LH1/k$c$a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LK1/a;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
