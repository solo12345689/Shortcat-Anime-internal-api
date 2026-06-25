.class final Landroidx/fragment/app/f$g$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f$g;->d(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/f$g;

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/f$g$a;->a:Landroidx/fragment/app/f$g;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/f$g$a;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/f$g$a;->c:Ljava/lang/Object;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f$g$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/f$g$a;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v0}, Landroidx/fragment/app/f$g;->v()Landroidx/fragment/app/X;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/f$g$a;->b:Landroid/view/ViewGroup;

    iget-object v2, p0, Landroidx/fragment/app/f$g$a;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/X;->e(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    return-void
.end method
