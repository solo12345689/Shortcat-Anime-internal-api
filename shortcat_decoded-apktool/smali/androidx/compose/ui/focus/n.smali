.class final Landroidx/compose/ui/focus/n;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq0/m;


# instance fields
.field private a:Landroidx/compose/ui/focus/k;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/n;->a:Landroidx/compose/ui/focus/k;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final E1()Landroidx/compose/ui/focus/k;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/n;->a:Landroidx/compose/ui/focus/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1(Landroidx/compose/ui/focus/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/focus/n;->a:Landroidx/compose/ui/focus/k;

    .line 2
    .line 3
    return-void
.end method

.method public onAttach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/e$c;->onAttach()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/focus/n;->a:Landroidx/compose/ui/focus/k;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/compose/ui/focus/k;->e()La0/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/n;->a:Landroidx/compose/ui/focus/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/k;->e()La0/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, La0/c;->w(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroidx/compose/ui/e$c;->onDetach()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
