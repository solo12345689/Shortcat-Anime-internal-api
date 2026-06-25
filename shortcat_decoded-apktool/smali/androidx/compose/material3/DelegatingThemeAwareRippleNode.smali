.class final Landroidx/compose/material3/DelegatingThemeAwareRippleNode;
.super LK0/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/h;
.implements LK0/j0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/compose/material3/DelegatingThemeAwareRippleNode;",
        "LK0/m;",
        "LK0/h;",
        "LK0/j0;",
        "LB/k;",
        "interactionSource",
        "",
        "bounded",
        "Li1/h;",
        "radius",
        "Ls0/t0;",
        "color",
        "<init>",
        "(LB/k;ZFLs0/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "LTd/L;",
        "Q1",
        "()V",
        "O1",
        "P1",
        "onAttach",
        "q0",
        "c",
        "LB/k;",
        "d",
        "Z",
        "e",
        "F",
        "Ls0/t0;",
        "LK0/j;",
        "f",
        "LK0/j;",
        "rippleNode",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:LB/k;

.field private final color:Ls0/t0;

.field private final d:Z

.field private final e:F

.field private f:LK0/j;


# direct methods
.method private constructor <init>(LB/k;ZFLs0/t0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LK0/m;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->c:LB/k;

    .line 4
    iput-boolean p2, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->d:Z

    .line 5
    iput p3, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->e:F

    .line 6
    iput-object p4, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->color:Ls0/t0;

    return-void
.end method

.method public synthetic constructor <init>(LB/k;ZFLs0/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;-><init>(LB/k;ZFLs0/t0;)V

    return-void
.end method

.method public static final synthetic K1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->O1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic L1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)Ls0/t0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->color:Ls0/t0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)LK0/j;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->f:LK0/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic N1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->P1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final O1()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$a;-><init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$b;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$b;-><init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->c:LB/k;

    .line 12
    .line 13
    iget-boolean v3, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->d:Z

    .line 14
    .line 15
    iget v4, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->e:F

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v0, v1}, LT/l;->c(LB/k;ZFLs0/t0;Lie/a;)LK0/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->f:LK0/j;

    .line 26
    .line 27
    return-void
.end method

.method private final P1()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->f:LK0/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, LK0/m;->H1(LK0/j;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private final Q1()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;-><init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, LK0/k0;->a(Landroidx/compose/ui/e$c;Lie/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onAttach()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->Q1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public q0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->Q1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
