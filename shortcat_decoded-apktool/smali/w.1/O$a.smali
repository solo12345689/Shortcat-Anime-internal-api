.class final Lw/O$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/O;->b(Lw/N;Ljava/lang/Object;Ljava/lang/Object;Lw/s0;Lw/M;Ljava/lang/String;LY/m;II)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lw/N$a;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lw/M;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lw/N$a;Ljava/lang/Object;Lw/M;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/O$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lw/O$a;->b:Lw/N$a;

    .line 4
    .line 5
    iput-object p3, p0, Lw/O$a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lw/O$a;->d:Lw/M;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw/O$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lw/O$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lw/O$a;->b:Lw/N$a;

    invoke-virtual {v1}, Lw/N$a;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lw/O$a;->c:Ljava/lang/Object;

    iget-object v1, p0, Lw/O$a;->b:Lw/N$a;

    invoke-virtual {v1}, Lw/N$a;->l()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lw/O$a;->b:Lw/N$a;

    .line 5
    iget-object v1, p0, Lw/O$a;->a:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Lw/O$a;->c:Ljava/lang/Object;

    .line 7
    iget-object v3, p0, Lw/O$a;->d:Lw/M;

    .line 8
    invoke-virtual {v0, v1, v2, v3}, Lw/N$a;->t(Ljava/lang/Object;Ljava/lang/Object;Lw/i;)V

    return-void
.end method
