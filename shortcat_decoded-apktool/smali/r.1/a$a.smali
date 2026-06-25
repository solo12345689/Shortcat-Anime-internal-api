.class Lr/a$a;
.super LC1/a$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/a;->b()LC1/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/a;


# direct methods
.method constructor <init>(Lr/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/a$a;->a:Lr/a;

    .line 2
    .line 3
    invoke-direct {p0}, LC1/a$c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/a$a;->a:Lr/a;

    .line 2
    .line 3
    iget-object v0, v0, Lr/a;->c:Lr/a$d;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lr/a$d;->a(ILjava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/a$a;->a:Lr/a;

    .line 2
    .line 3
    iget-object v0, v0, Lr/a;->c:Lr/a$d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/a$d;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr/a$a;->a:Lr/a;

    .line 2
    .line 3
    iget-object p1, p1, Lr/a;->c:Lr/a$d;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lr/a$d;->c(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(LC1/a$d;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, LC1/a$d;->a()LC1/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lr/i;->c(LC1/a$e;)Lr/f$c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    new-instance v0, Lr/f$b;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p1, v1}, Lr/f$b;-><init>(Lr/f$c;I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lr/a$a;->a:Lr/a;

    .line 20
    .line 21
    iget-object p1, p1, Lr/a;->c:Lr/a$d;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lr/a$d;->d(Lr/f$b;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
