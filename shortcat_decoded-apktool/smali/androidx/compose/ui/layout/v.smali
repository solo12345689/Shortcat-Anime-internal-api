.class final Landroidx/compose/ui/layout/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/layout/u;


# instance fields
.field private final b:Ljava/lang/String;

.field private c:Landroidx/compose/ui/layout/E;

.field private d:Landroidx/compose/ui/layout/c;

.field private e:Landroidx/compose/ui/layout/E;

.field private f:Landroidx/compose/ui/layout/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/v;->b:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/ui/layout/E;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/compose/ui/layout/E;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/ui/layout/v;->c:Landroidx/compose/ui/layout/E;

    .line 12
    .line 13
    new-instance p1, Landroidx/compose/ui/layout/c;

    .line 14
    .line 15
    invoke-direct {p1}, Landroidx/compose/ui/layout/c;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/compose/ui/layout/v;->d:Landroidx/compose/ui/layout/c;

    .line 19
    .line 20
    new-instance p1, Landroidx/compose/ui/layout/E;

    .line 21
    .line 22
    invoke-direct {p1}, Landroidx/compose/ui/layout/E;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/compose/ui/layout/v;->e:Landroidx/compose/ui/layout/E;

    .line 26
    .line 27
    new-instance p1, Landroidx/compose/ui/layout/c;

    .line 28
    .line 29
    invoke-direct {p1}, Landroidx/compose/ui/layout/c;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/compose/ui/layout/v;->f:Landroidx/compose/ui/layout/c;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a()Landroidx/compose/ui/layout/E;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/v;->c:Landroidx/compose/ui/layout/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Landroidx/compose/ui/layout/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/v;->d:Landroidx/compose/ui/layout/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Landroidx/compose/ui/layout/E;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/v;->e:Landroidx/compose/ui/layout/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Landroidx/compose/ui/layout/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/v;->f:Landroidx/compose/ui/layout/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/v;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "RectRulers("

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/ui/layout/v;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
