.class final Lc4/i$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc4/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc4/i;

.field final synthetic b:LK1/a;


# direct methods
.method constructor <init>(Lc4/i;LK1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/i$a$a;->a:Lc4/i;

    .line 2
    .line 3
    iput-object p2, p0, Lc4/i$a$a;->b:LK1/a;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc4/i$a$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lc4/i$a$a;->a:Lc4/i;

    invoke-static {v0}, Lc4/i;->b(Lc4/i;)Ld4/a;

    move-result-object v0

    iget-object v1, p0, Lc4/i$a$a;->b:LK1/a;

    invoke-interface {v0, v1}, Ld4/a;->a(LK1/a;)V

    return-void
.end method
