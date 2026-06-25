.class public final Lcom/google/android/material/datepicker/i;
.super Lcom/google/android/material/datepicker/q;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/i$m;,
        Lcom/google/android/material/datepicker/i$l;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/q;"
    }
.end annotation


# static fields
.field static final o:Ljava/lang/Object;

.field static final p:Ljava/lang/Object;

.field static final q:Ljava/lang/Object;

.field static final r:Ljava/lang/Object;


# instance fields
.field private b:I

.field private c:Lcom/google/android/material/datepicker/a;

.field private d:Lcom/google/android/material/datepicker/m;

.field private e:Lcom/google/android/material/datepicker/i$l;

.field private f:Lcom/google/android/material/datepicker/c;

.field private g:Landroidx/recyclerview/widget/RecyclerView;

.field private h:Landroidx/recyclerview/widget/RecyclerView;

.field private i:Landroid/view/View;

.field private j:Landroid/view/View;

.field private k:Landroid/view/View;

.field private l:Landroid/view/View;

.field private m:Lcom/google/android/material/button/MaterialButton;

.field private n:Landroid/view/accessibility/AccessibilityManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "MONTHS_VIEW_GROUP_TAG"

    .line 2
    .line 3
    sput-object v0, Lcom/google/android/material/datepicker/i;->o:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v0, "NAVIGATION_PREV_TAG"

    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/datepicker/i;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v0, "NAVIGATION_NEXT_TAG"

    .line 10
    .line 11
    sput-object v0, Lcom/google/android/material/datepicker/i;->q:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v0, "SELECTOR_TOGGLE_TAG"

    .line 14
    .line 15
    sput-object v0, Lcom/google/android/material/datepicker/i;->r:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/q;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic A(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/d;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method static synthetic B(Lcom/google/android/material/datepicker/i;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->l:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic C(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/m;)Lcom/google/android/material/datepicker/m;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic D(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/button/MaterialButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->m:Lcom/google/android/material/button/MaterialButton;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic E(Lcom/google/android/material/datepicker/i;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/datepicker/i;->U(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private F(Landroid/view/View;Lcom/google/android/material/datepicker/o;)V
    .locals 2

    .line 1
    sget v0, Lo9/e;->r:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->m:Lcom/google/android/material/button/MaterialButton;

    .line 10
    .line 11
    sget-object v1, Lcom/google/android/material/datepicker/i;->r:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->m:Lcom/google/android/material/button/MaterialButton;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/material/datepicker/i$h;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/i$h;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/core/view/a0;->k0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 24
    .line 25
    .line 26
    sget v0, Lo9/e;->t:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->i:Landroid/view/View;

    .line 33
    .line 34
    sget-object v1, Lcom/google/android/material/datepicker/i;->p:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget v0, Lo9/e;->s:I

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->j:Landroid/view/View;

    .line 46
    .line 47
    sget-object v1, Lcom/google/android/material/datepicker/i;->q:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget v0, Lo9/e;->A:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->k:Landroid/view/View;

    .line 59
    .line 60
    sget v0, Lo9/e;->v:I

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->l:Landroid/view/View;

    .line 67
    .line 68
    sget-object p1, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/i;->R(Lcom/google/android/material/datepicker/i$l;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->m:Lcom/google/android/material/button/MaterialButton;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/m;->r()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 85
    .line 86
    new-instance v0, Lcom/google/android/material/datepicker/i$i;

    .line 87
    .line 88
    invoke-direct {v0, p0, p2}, Lcom/google/android/material/datepicker/i$i;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/o;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->m:Lcom/google/android/material/button/MaterialButton;

    .line 95
    .line 96
    new-instance v0, Lcom/google/android/material/datepicker/i$j;

    .line 97
    .line 98
    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/i$j;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->j:Landroid/view/View;

    .line 105
    .line 106
    new-instance v0, Lcom/google/android/material/datepicker/i$k;

    .line 107
    .line 108
    invoke-direct {v0, p0, p2}, Lcom/google/android/material/datepicker/i$k;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/o;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->i:Landroid/view/View;

    .line 115
    .line 116
    new-instance v0, Lcom/google/android/material/datepicker/i$a;

    .line 117
    .line 118
    invoke-direct {v0, p0, p2}, Lcom/google/android/material/datepicker/i$a;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/o;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 125
    .line 126
    invoke-virtual {p2, p1}, Lcom/google/android/material/datepicker/o;->y(Lcom/google/android/material/datepicker/m;)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-direct {p0, p1}, Lcom/google/android/material/datepicker/i;->U(I)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method private G()Landroidx/recyclerview/widget/RecyclerView$o;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/datepicker/i$g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/i$g;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static L(Landroid/content/Context;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Lo9/c;->a0:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static M(Landroid/content/Context;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Lo9/c;->h0:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget v1, Lo9/c;->i0:I

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v0, v1

    .line 18
    sget v1, Lo9/c;->g0:I

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    sget v1, Lo9/c;->c0:I

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sget v2, Lcom/google/android/material/datepicker/n;->e:I

    .line 32
    .line 33
    sget v3, Lo9/c;->a0:I

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    mul-int/2addr v3, v2

    .line 40
    add-int/lit8 v2, v2, -0x1

    .line 41
    .line 42
    sget v4, Lo9/c;->f0:I

    .line 43
    .line 44
    invoke-virtual {p0, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    mul-int/2addr v2, v4

    .line 49
    add-int/2addr v3, v2

    .line 50
    sget v2, Lo9/c;->Y:I

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr v0, v1

    .line 57
    add-int/2addr v0, v3

    .line 58
    add-int/2addr v0, p0

    .line 59
    return v0
.end method

.method public static O(Lcom/google/android/material/datepicker/d;ILcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/i;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/material/datepicker/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/datepicker/i;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "THEME_RES_ID_KEY"

    .line 12
    .line 13
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    const-string p1, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {v1, p1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "CALENDAR_CONSTRAINTS_KEY"

    .line 22
    .line 23
    invoke-virtual {v1, p0, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "DAY_VIEW_DECORATOR_KEY"

    .line 27
    .line 28
    invoke-virtual {v1, p0, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    const-string p0, "CURRENT_MONTH_KEY"

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/google/android/material/datepicker/a;->j()Lcom/google/android/material/datepicker/m;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method private P(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/material/datepicker/i$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/google/android/material/datepicker/i$b;-><init>(Lcom/google/android/material/datepicker/i;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private S()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/material/datepicker/i$f;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/i$f;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Landroidx/core/view/a0;->k0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private U(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->j:Landroid/view/View;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$h;->e()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    move v1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v3

    .line 22
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->i:Landroid/view/View;

    .line 26
    .line 27
    sub-int/2addr p1, v4

    .line 28
    if-ltz p1, :cond_1

    .line 29
    .line 30
    move v3, v4

    .line 31
    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method static synthetic y(Lcom/google/android/material/datepicker/i;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic z(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method H()Lcom/google/android/material/datepicker/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 2
    .line 3
    return-object v0
.end method

.method I()Lcom/google/android/material/datepicker/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->f:Lcom/google/android/material/datepicker/c;

    .line 2
    .line 3
    return-object v0
.end method

.method J()Lcom/google/android/material/datepicker/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public K()Lcom/google/android/material/datepicker/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method N()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    .line 9
    return-object v0
.end method

.method Q(Lcom/google/android/material/datepicker/m;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/o;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/o;->y(Lcom/google/android/material/datepicker/m;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->n:Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->n1(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/o;->y(Lcom/google/android/material/datepicker/m;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sub-int v0, v1, v0

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    const/4 v5, 0x3

    .line 46
    if-le v2, v5, :cond_1

    .line 47
    .line 48
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v3

    .line 51
    :goto_0
    if-lez v0, :cond_2

    .line 52
    .line 53
    move v3, v4

    .line 54
    :cond_2
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    add-int/lit8 v0, v1, -0x3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->n1(I)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/i;->P(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    if-eqz v2, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    add-int/lit8 v0, v1, 0x3

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->n1(I)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/i;->P(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/i;->P(I)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/i;->U(I)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method R(Lcom/google/android/material/datepicker/i$l;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->e:Lcom/google/android/material/datepicker/i$l;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/material/datepicker/i$l;->b:Lcom/google/android/material/datepicker/i$l;

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/datepicker/u;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 25
    .line 26
    iget v3, v3, Lcom/google/android/material/datepicker/m;->c:I

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Lcom/google/android/material/datepicker/u;->v(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$p;->B1(I)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->k:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->l:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->i:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->j:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    sget-object v0, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    .line 57
    .line 58
    if-ne p1, v0, :cond_1

    .line 59
    .line 60
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->k:Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->l:Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->i:Landroid/view/View;

    .line 71
    .line 72
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->j:Landroid/view/View;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/i;->Q(Lcom/google/android/material/datepicker/m;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    return-void
.end method

.method T()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->e:Lcom/google/android/material/datepicker/i$l;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/material/datepicker/i$l;->b:Lcom/google/android/material/datepicker/i$l;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/i;->R(Lcom/google/android/material/datepicker/i$l;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    sget v1, Lo9/i;->A:I

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    sget-object v2, Lcom/google/android/material/datepicker/i$l;->a:Lcom/google/android/material/datepicker/i$l;

    .line 25
    .line 26
    if-ne v0, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/i;->R(Lcom/google/android/material/datepicker/i$l;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    sget v1, Lo9/i;->B:I

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getArguments()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/google/android/material/datepicker/i;->b:I

    .line 17
    .line 18
    const-string v0, "GRID_SELECTOR_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/google/android/material/datepicker/a;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 36
    .line 37
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "CURRENT_MONTH_KEY"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/google/android/material/datepicker/m;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 55
    .line 56
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 1
    new-instance v6, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, p0, Lcom/google/android/material/datepicker/i;->b:I

    .line 8
    .line 9
    invoke-direct {v6, v0, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/google/android/material/datepicker/c;

    .line 13
    .line 14
    invoke-direct {v0, v6}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->f:Lcom/google/android/material/datepicker/c;

    .line 18
    .line 19
    invoke-virtual {p1, v6}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "accessibility"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    iput-object v2, p0, Lcom/google/android/material/datepicker/i;->n:Landroid/view/accessibility/AccessibilityManager;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/m;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v6}, Lcom/google/android/material/datepicker/k;->X(Landroid/content/Context;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v7, 0x1

    .line 48
    const/4 v8, 0x0

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    sget v3, Lo9/g;->r:I

    .line 52
    .line 53
    move v5, v7

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget v3, Lo9/g;->p:I

    .line 56
    .line 57
    move v5, v8

    .line 58
    :goto_0
    invoke-virtual {v0, v3, p2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lcom/google/android/material/datepicker/i;->M(Landroid/content/Context;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {v9, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 71
    .line 72
    .line 73
    sget v0, Lo9/e;->w:I

    .line 74
    .line 75
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroid/widget/GridView;

    .line 80
    .line 81
    new-instance v3, Lcom/google/android/material/datepicker/i$c;

    .line 82
    .line 83
    invoke-direct {v3, p0}, Lcom/google/android/material/datepicker/i$c;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v3}, Landroidx/core/view/a0;->k0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 87
    .line 88
    .line 89
    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/google/android/material/datepicker/a;->h()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    new-instance v4, Lcom/google/android/material/datepicker/h;

    .line 96
    .line 97
    if-lez v3, :cond_1

    .line 98
    .line 99
    invoke-direct {v4, v3}, Lcom/google/android/material/datepicker/h;-><init>(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-direct {v4}, Lcom/google/android/material/datepicker/h;-><init>()V

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-virtual {v0, v4}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 107
    .line 108
    .line 109
    iget v2, v2, Lcom/google/android/material/datepicker/m;->d:I

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    .line 117
    sget v0, Lo9/e;->z:I

    .line 118
    .line 119
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 124
    .line 125
    iput-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 126
    .line 127
    new-instance v0, Lcom/google/android/material/datepicker/i$d;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    const/4 v4, 0x0

    .line 134
    move v3, v5

    .line 135
    move-object v1, p0

    .line 136
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/datepicker/i$d;-><init>(Lcom/google/android/material/datepicker/i;Landroid/content/Context;IZI)V

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 140
    .line 141
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 145
    .line 146
    sget-object v1, Lcom/google/android/material/datepicker/i;->o:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, Lcom/google/android/material/datepicker/o;

    .line 152
    .line 153
    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 154
    .line 155
    new-instance v5, Lcom/google/android/material/datepicker/i$e;

    .line 156
    .line 157
    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/i$e;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 158
    .line 159
    .line 160
    const/4 v2, 0x0

    .line 161
    const/4 v4, 0x0

    .line 162
    move-object v1, v6

    .line 163
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/datepicker/o;-><init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/i$m;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    sget v3, Lo9/f;->c:I

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    sget v3, Lo9/e;->A:I

    .line 182
    .line 183
    invoke-virtual {v9, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    iput-object v3, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 190
    .line 191
    if-eqz v3, :cond_2

    .line 192
    .line 193
    invoke-virtual {v3, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 194
    .line 195
    .line 196
    iget-object v3, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 197
    .line 198
    new-instance v4, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 199
    .line 200
    invoke-direct {v4, v1, v2, v7, v8}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 207
    .line 208
    new-instance v3, Lcom/google/android/material/datepicker/u;

    .line 209
    .line 210
    invoke-direct {v3, p0}, Lcom/google/android/material/datepicker/u;-><init>(Lcom/google/android/material/datepicker/i;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    .line 214
    .line 215
    .line 216
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 217
    .line 218
    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->G()Landroidx/recyclerview/widget/RecyclerView$o;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 223
    .line 224
    .line 225
    :cond_2
    sget v2, Lo9/e;->r:I

    .line 226
    .line 227
    invoke-virtual {v9, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    if-eqz v2, :cond_3

    .line 232
    .line 233
    invoke-direct {p0, v9, v0}, Lcom/google/android/material/datepicker/i;->F(Landroid/view/View;Lcom/google/android/material/datepicker/o;)V

    .line 234
    .line 235
    .line 236
    :cond_3
    invoke-static {v1}, Lcom/google/android/material/datepicker/k;->X(Landroid/content/Context;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-nez v1, :cond_4

    .line 241
    .line 242
    new-instance v1, Landroidx/recyclerview/widget/j;

    .line 243
    .line 244
    invoke-direct {v1}, Landroidx/recyclerview/widget/j;-><init>()V

    .line 245
    .line 246
    .line 247
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 248
    .line 249
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/n;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 250
    .line 251
    .line 252
    :cond_4
    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 253
    .line 254
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 255
    .line 256
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/o;->y(Lcom/google/android/material/datepicker/m;)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->n1(I)V

    .line 261
    .line 262
    .line 263
    invoke-direct {p0}, Lcom/google/android/material/datepicker/i;->S()V

    .line 264
    .line 265
    .line 266
    return-object v9
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "THEME_RES_ID_KEY"

    .line 5
    .line 6
    iget v1, p0, Lcom/google/android/material/datepicker/i;->b:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "GRID_SELECTOR_KEY"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/material/datepicker/i;->c:Lcom/google/android/material/datepicker/a;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "CURRENT_MONTH_KEY"

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/material/datepicker/i;->d:Lcom/google/android/material/datepicker/m;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public w(Lcom/google/android/material/datepicker/p;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/material/datepicker/q;->w(Lcom/google/android/material/datepicker/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
