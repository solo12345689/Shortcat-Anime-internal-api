.class public Lb5/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/j;


# instance fields
.field private final a:LS4/j;

.field private final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;LS4/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lb5/a;->b:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LS4/j;

    .line 17
    .line 18
    iput-object p1, p0, Lb5/a;->a:LS4/j;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILS4/h;)LU4/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/a;->a:LS4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LS4/j;->a(Ljava/lang/Object;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lb5/a;->b:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-static {p2, p1}, Lb5/T;->c(Landroid/content/res/Resources;LU4/v;)LU4/v;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public b(Ljava/lang/Object;LS4/h;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/a;->a:LS4/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LS4/j;->b(Ljava/lang/Object;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
