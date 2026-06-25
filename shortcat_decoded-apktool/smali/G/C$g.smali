.class final LG/C$g;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/C;-><init>(IFLF/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LG/C;


# direct methods
.method constructor <init>(LG/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/C$g;->a:LG/C;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Integer;
    .locals 1

    .line 2
    iget-object v0, p0, LG/C$g;->a:LG/C;

    invoke-virtual {v0}, LG/C;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, LG/C$g;->a:LG/C;

    invoke-static {v0}, LG/C;->j(LG/C;)I

    move-result v0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LG/C$g;->a:LG/C;

    invoke-virtual {v0}, LG/C;->v()I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LG/C$g;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
