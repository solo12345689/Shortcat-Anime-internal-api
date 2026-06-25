.class public Lio/invertase/notifee/b$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/invertase/notifee/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:Lio/invertase/notifee/b$d;

.field private final d:I

.field private e:I

.field private final f:Lcom/facebook/react/bridge/WritableMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/facebook/react/bridge/WritableMap;Lio/invertase/notifee/b$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/invertase/notifee/b$e;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/invertase/notifee/b$e;->b:J

    .line 7
    .line 8
    iput-object p5, p0, Lio/invertase/notifee/b$e;->c:Lio/invertase/notifee/b$d;

    .line 9
    .line 10
    invoke-static {}, Lio/invertase/notifee/b;->g()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lio/invertase/notifee/b$e;->d:I

    .line 15
    .line 16
    const-string p2, "taskId"

    .line 17
    .line 18
    invoke-interface {p4, p2, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    iput-object p4, p0, Lio/invertase/notifee/b$e;->f:Lcom/facebook/react/bridge/WritableMap;

    .line 22
    .line 23
    return-void
.end method

.method static bridge synthetic a(Lio/invertase/notifee/b$e;)I
    .locals 0

    .line 1
    iget p0, p0, Lio/invertase/notifee/b$e;->e:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public b()Lio/invertase/notifee/b$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/b$e;->c:Lio/invertase/notifee/b$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lio/invertase/notifee/b$e;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public d()Lj7/a;
    .locals 6

    .line 1
    new-instance v0, Lj7/a;

    .line 2
    .line 3
    iget-object v1, p0, Lio/invertase/notifee/b$e;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lio/invertase/notifee/b$e;->f:Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    iget-wide v3, p0, Lio/invertase/notifee/b$e;->b:J

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    invoke-direct/range {v0 .. v5}, Lj7/a;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZ)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lio/invertase/notifee/b$e;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public f(I)V
    .locals 0

    .line 1
    iput p1, p0, Lio/invertase/notifee/b$e;->e:I

    .line 2
    .line 3
    return-void
.end method
