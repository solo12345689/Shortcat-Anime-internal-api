.class Lb2/h$f;
.super Lb2/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/h;-><init>(Lb2/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb2/k;

.field final synthetic c:Lb2/h;


# direct methods
.method constructor <init>(Lb2/h;Ljava/lang/String;Lb2/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb2/h$f;->c:Lb2/h;

    .line 2
    .line 3
    iput-object p3, p0, Lb2/h$f;->b:Lb2/k;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lb2/j;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)F
    .locals 0

    .line 1
    iget-object p1, p0, Lb2/h$f;->b:Lb2/k;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb2/k;->a()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Ljava/lang/Object;F)V
    .locals 0

    .line 1
    iget-object p1, p0, Lb2/h$f;->b:Lb2/k;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lb2/k;->b(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
