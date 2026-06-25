.class final La1/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:La1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/c;

    .line 2
    .line 3
    invoke-direct {v0}, La1/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/c;->a:La1/c;

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

.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;LU0/T0;Lr0/h;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 5

    .line 1
    invoke-virtual {p2}, Lr0/h;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lr0/h;->l()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1, v0}, LU0/T0;->r(F)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2}, Lr0/h;->e()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1, p2}, LU0/T0;->r(F)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-gt v0, p2, :cond_0

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p1, v0}, LU0/T0;->s(I)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p1, v0}, LU0/T0;->v(I)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1, v0}, LU0/T0;->t(I)F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p1, v0}, LU0/T0;->m(I)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-static {p0, v1, v2, v3, v4}, LN/m;->a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;FFFF)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 42
    .line 43
    .line 44
    if-eq v0, p2, :cond_0

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object p0
.end method
