.class Lcom/google/android/material/navigation/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/navigation/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/navigation/m;


# direct methods
.method constructor <init>(Lcom/google/android/material/navigation/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/m$a;->a:Lcom/google/android/material/navigation/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/navigation/m$a;->a:Lcom/google/android/material/navigation/m;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/material/navigation/m;->a(Lcom/google/android/material/navigation/m;)Lcom/google/android/material/navigation/m$b;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/navigation/m$a;->a:Lcom/google/android/material/navigation/m;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/android/material/navigation/m;->b(Lcom/google/android/material/navigation/m;)Lcom/google/android/material/navigation/m$c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/material/navigation/m$a;->a:Lcom/google/android/material/navigation/m;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/google/android/material/navigation/m;->b(Lcom/google/android/material/navigation/m;)Lcom/google/android/material/navigation/m$c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1, p2}, Lcom/google/android/material/navigation/m$c;->a(Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0

    .line 1
    return-void
.end method
