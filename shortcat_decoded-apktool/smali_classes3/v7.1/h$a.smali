.class public final Lv7/h$a;
.super Ljava/io/FilterOutputStream;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv7/h;->i(Ltg/i;)Ltg/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:J

.field final synthetic b:Lv7/h;


# direct methods
.method constructor <init>(Lv7/h;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv7/h$a;->b:Lv7/h;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-wide v1, p0, Lv7/h$a;->a:J

    .line 2
    .line 3
    iget-object v0, p0, Lv7/h$a;->b:Lv7/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Lv7/h;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    iget-object v0, p0, Lv7/h$a;->b:Lv7/h;

    .line 10
    .line 11
    invoke-static {v0}, Lv7/h;->g(Lv7/h;)Lv7/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    cmp-long v5, v1, v3

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v5, 0x0

    .line 22
    :goto_0
    invoke-interface/range {v0 .. v5}, Lv7/g;->a(JJZ)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public write(I)V
    .locals 4

    .line 4
    invoke-super {p0, p1}, Ljava/io/FilterOutputStream;->write(I)V

    .line 5
    iget-wide v0, p0, Lv7/h$a;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lv7/h$a;->a:J

    .line 6
    invoke-virtual {p0}, Lv7/h$a;->a()V

    return-void
.end method

.method public write([BII)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterOutputStream;->write([BII)V

    .line 2
    iget-wide p1, p0, Lv7/h$a;->a:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lv7/h$a;->a:J

    .line 3
    invoke-virtual {p0}, Lv7/h$a;->a()V

    return-void
.end method
