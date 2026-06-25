.class final LK/i$n$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$n;->invoke(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/y;

.field final synthetic b:La1/t;


# direct methods
.method constructor <init>(LK/y;La1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$n$f;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$n$f;->b:La1/t;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 2

    .line 2
    iget-object v0, p0, LK/i$n$f;->a:LK/y;

    invoke-virtual {v0}, LK/y;->l()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, LK/i$n$f;->b:La1/t;

    invoke-virtual {v1}, La1/t;->e()I

    move-result v1

    invoke-static {v1}, La1/s;->j(I)La1/s;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/i$n$f;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
