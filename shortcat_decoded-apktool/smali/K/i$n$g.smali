.class final LK/i$n$g;
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

.field final synthetic b:Landroidx/compose/ui/focus/k;

.field final synthetic c:Z


# direct methods
.method constructor <init>(LK/y;Landroidx/compose/ui/focus/k;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$n$g;->a:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$n$g;->b:Landroidx/compose/ui/focus/k;

    .line 4
    .line 5
    iput-boolean p3, p0, LK/i$n$g;->c:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 3

    .line 2
    iget-object v0, p0, LK/i$n$g;->a:LK/y;

    iget-object v1, p0, LK/i$n$g;->b:Landroidx/compose/ui/focus/k;

    iget-boolean v2, p0, LK/i$n$g;->c:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, LK/i;->l(LK/y;Landroidx/compose/ui/focus/k;Z)V

    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/i$n$g;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
