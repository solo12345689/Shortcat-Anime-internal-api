.class public final LIb/g$s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lk5/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIb/g;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;

.field final synthetic b:LUb/u;

.field final synthetic c:Lkotlin/jvm/internal/L;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;LUb/u;Lkotlin/jvm/internal/L;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, LIb/g$s;->a:Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    iput-object p2, p0, LIb/g$s;->b:LUb/u;

    .line 4
    .line 5
    iput-object p3, p0, LIb/g$s;->c:Lkotlin/jvm/internal/L;

    .line 6
    .line 7
    iput-object p4, p0, LIb/g$s;->d:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z
    .locals 0

    .line 1
    const-string p5, "resource"

    .line 2
    .line 3
    invoke-static {p1, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "model"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "target"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "dataSource"

    .line 17
    .line 18
    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LIb/g$s;->c:Lkotlin/jvm/internal/L;

    .line 22
    .line 23
    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    add-int/2addr p2, p3

    .line 27
    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    .line 28
    .line 29
    iget-object p1, p0, LIb/g$s;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne p2, p1, :cond_0

    .line 36
    .line 37
    iget-object p1, p0, LIb/g$s;->b:LUb/u;

    .line 38
    .line 39
    invoke-interface {p1, p3}, LUb/u;->a(Z)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return p3
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, LIb/g$s;->a(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Ll5/d;LS4/a;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g(LU4/q;Ljava/lang/Object;Ll5/d;Z)Z
    .locals 0

    .line 1
    const-string p1, "target"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LIb/g$s;->a:Lkotlin/jvm/internal/J;

    .line 7
    .line 8
    iget-boolean p2, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    iput-boolean p3, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 14
    .line 15
    iget-object p1, p0, LIb/g$s;->b:LUb/u;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-interface {p1, p2}, LUb/u;->a(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return p3
.end method
