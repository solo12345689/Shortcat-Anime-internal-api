.class public final LT3/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS3/h$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LS3/h$b;)LS3/h;
    .locals 7

    .line 1
    const-string v0, "configuration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LT3/d;

    .line 7
    .line 8
    iget-object v2, p1, LS3/h$b;->a:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v3, p1, LS3/h$b;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, p1, LS3/h$b;->c:LS3/h$a;

    .line 13
    .line 14
    iget-boolean v5, p1, LS3/h$b;->d:Z

    .line 15
    .line 16
    iget-boolean v6, p1, LS3/h$b;->e:Z

    .line 17
    .line 18
    invoke-direct/range {v1 .. v6}, LT3/d;-><init>(Landroid/content/Context;Ljava/lang/String;LS3/h$a;ZZ)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method
