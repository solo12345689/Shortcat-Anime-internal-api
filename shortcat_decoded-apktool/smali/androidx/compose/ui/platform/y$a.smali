.class public final Landroidx/compose/ui/platform/y$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/y;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/y;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/platform/y;->u(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/platform/y;->u(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, -0x1

    .line 14
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Landroidx/compose/ui/platform/y;->M(Landroidx/compose/ui/platform/y;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroidx/compose/ui/platform/y;->y(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Landroidx/compose/ui/platform/y;->F(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/platform/y;->A(Landroidx/compose/ui/platform/y;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/compose/ui/platform/y;->D(Landroidx/compose/ui/platform/y;)Ljava/lang/Runnable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/ui/platform/y;->u(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Landroidx/compose/ui/platform/y$a;->a:Landroidx/compose/ui/platform/y;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/compose/ui/platform/y;->y(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Landroidx/compose/ui/platform/y;->F(Landroidx/compose/ui/platform/y;)Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method
