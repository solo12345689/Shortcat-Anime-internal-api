.class public final LBa/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/widget/EditText;

.field private final b:Lie/r;

.field private c:I

.field private d:I

.field private e:I

.field private final f:Landroid/view/ViewTreeObserver$OnPreDrawListener;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Lie/r;)V
    .locals 1

    .line 1
    const-string v0, "editText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LBa/e;->a:Landroid/widget/EditText;

    .line 15
    .line 16
    iput-object p2, p0, LBa/e;->b:Lie/r;

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, LBa/e;->c:I

    .line 20
    .line 21
    iput p1, p0, LBa/e;->d:I

    .line 22
    .line 23
    iput p1, p0, LBa/e;->e:I

    .line 24
    .line 25
    new-instance p1, LBa/e$a;

    .line 26
    .line 27
    invoke-direct {p1, p0}, LBa/e$a;-><init>(LBa/e;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LBa/e;->f:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic a(LBa/e;)Lie/r;
    .locals 0

    .line 1
    iget-object p0, p0, LBa/e;->b:Lie/r;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LBa/e;)Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, LBa/e;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LBa/e;)I
    .locals 0

    .line 1
    iget p0, p0, LBa/e;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic d(LBa/e;)I
    .locals 0

    .line 1
    iget p0, p0, LBa/e;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(LBa/e;)I
    .locals 0

    .line 1
    iget p0, p0, LBa/e;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic f(LBa/e;I)V
    .locals 0

    .line 1
    iput p1, p0, LBa/e;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic g(LBa/e;I)V
    .locals 0

    .line 1
    iput p1, p0, LBa/e;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic h(LBa/e;I)V
    .locals 0

    .line 1
    iput p1, p0, LBa/e;->c:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, LBa/e;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LBa/e;->f:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, LBa/e;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LBa/e;->f:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
