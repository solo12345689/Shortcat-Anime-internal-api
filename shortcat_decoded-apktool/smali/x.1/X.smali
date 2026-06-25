.class public final Lx/X;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lx/W;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/X$a;
    }
.end annotation


# static fields
.field public static final b:Lx/X;

.field private static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx/X;

    .line 2
    .line 3
    invoke-direct {v0}, Lx/X;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx/X;->b:Lx/X;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/view/View;ZJFFZLi1/d;F)Lx/V;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p9}, Lx/X;->c(Landroid/view/View;ZJFFZLi1/d;F)Lx/X$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    sget-boolean v0, Lx/X;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public c(Landroid/view/View;ZJFFZLi1/d;F)Lx/X$a;
    .locals 0

    .line 1
    new-instance p2, Lx/X$a;

    .line 2
    .line 3
    new-instance p3, Landroid/widget/Magnifier;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p2, p3}, Lx/X$a;-><init>(Landroid/widget/Magnifier;)V

    .line 9
    .line 10
    .line 11
    return-object p2
.end method
