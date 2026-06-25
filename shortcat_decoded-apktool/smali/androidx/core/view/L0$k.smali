.class Landroidx/core/view/L0$k;
.super Landroidx/core/view/L0$j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/L0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# instance fields
.field private o:LA1/b;

.field private p:LA1/b;

.field private q:LA1/b;


# direct methods
.method constructor <init>(Landroidx/core/view/L0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/core/view/L0$j;-><init>(Landroidx/core/view/L0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/core/view/L0$k;->o:LA1/b;

    .line 3
    iput-object p1, p0, Landroidx/core/view/L0$k;->p:LA1/b;

    .line 4
    iput-object p1, p0, Landroidx/core/view/L0$k;->q:LA1/b;

    return-void
.end method

.method constructor <init>(Landroidx/core/view/L0;Landroidx/core/view/L0$k;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/core/view/L0$j;-><init>(Landroidx/core/view/L0;Landroidx/core/view/L0$j;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/core/view/L0$k;->o:LA1/b;

    .line 7
    iput-object p1, p0, Landroidx/core/view/L0$k;->p:LA1/b;

    .line 8
    iput-object p1, p0, Landroidx/core/view/L0$k;->q:LA1/b;

    return-void
.end method


# virtual methods
.method i()LA1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$k;->p:LA1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/view/X0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LA1/b;->f(Landroid/graphics/Insets;)LA1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/core/view/L0$k;->p:LA1/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/core/view/L0$k;->p:LA1/b;

    .line 18
    .line 19
    return-object v0
.end method

.method k()LA1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$k;->o:LA1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/view/Y0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LA1/b;->f(Landroid/graphics/Insets;)LA1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/core/view/L0$k;->o:LA1/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/core/view/L0$k;->o:LA1/b;

    .line 18
    .line 19
    return-object v0
.end method

.method m()LA1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$k;->q:LA1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/view/V0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LA1/b;->f(Landroid/graphics/Insets;)LA1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/core/view/L0$k;->q:LA1/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/core/view/L0$k;->q:LA1/b;

    .line 18
    .line 19
    return-object v0
.end method

.method n(IIII)Landroidx/core/view/L0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/view/L0$h;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Landroidx/core/view/W0;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Landroidx/core/view/L0;->z(Landroid/view/WindowInsets;)Landroidx/core/view/L0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public u(LA1/b;)V
    .locals 0

    .line 1
    return-void
.end method
