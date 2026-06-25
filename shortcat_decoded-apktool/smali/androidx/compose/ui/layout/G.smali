.class final Landroidx/compose/ui/layout/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/layout/F;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Landroidx/compose/ui/layout/u;

.field private final d:Landroidx/compose/ui/layout/u;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/G;->b:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p1}, Landroidx/compose/ui/layout/w;->a(Ljava/lang/String;)Landroidx/compose/ui/layout/u;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/compose/ui/layout/G;->c:Landroidx/compose/ui/layout/u;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, " maximum"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Landroidx/compose/ui/layout/w;->a(Ljava/lang/String;)Landroidx/compose/ui/layout/u;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Landroidx/compose/ui/layout/G;->d:Landroidx/compose/ui/layout/u;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public a()Landroidx/compose/ui/layout/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/G;->c:Landroidx/compose/ui/layout/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Landroidx/compose/ui/layout/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/G;->d:Landroidx/compose/ui/layout/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/G;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
