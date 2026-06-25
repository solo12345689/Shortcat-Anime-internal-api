.class public LE2/j$c;
.super LE2/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final i:Landroid/net/Uri;

.field public final j:J

.field private final k:Ljava/lang/String;

.field private final l:LE2/i;

.field private final m:LE2/m;


# direct methods
.method public constructor <init>(JLq2/x;Ljava/util/List;LE2/k$e;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;J)V
    .locals 10

    .line 1
    const/4 v9, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move-object v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    move-object/from16 v7, p7

    .line 10
    .line 11
    move-object/from16 v8, p8

    .line 12
    .line 13
    invoke-direct/range {v0 .. v9}, LE2/j;-><init>(JLq2/x;Ljava/util/List;LE2/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;LE2/j$a;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, LE2/b;

    .line 22
    .line 23
    iget-object p1, p1, LE2/b;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, LE2/j$c;->i:Landroid/net/Uri;

    .line 30
    .line 31
    invoke-virtual {p5}, LE2/k$e;->c()LE2/i;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LE2/j$c;->l:LE2/i;

    .line 36
    .line 37
    move-object/from16 p2, p9

    .line 38
    .line 39
    iput-object p2, p0, LE2/j$c;->k:Ljava/lang/String;

    .line 40
    .line 41
    move-wide/from16 p2, p10

    .line 42
    .line 43
    iput-wide p2, p0, LE2/j$c;->j:J

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p1, LE2/m;

    .line 50
    .line 51
    new-instance p4, LE2/i;

    .line 52
    .line 53
    const/4 p5, 0x0

    .line 54
    const-wide/16 v1, 0x0

    .line 55
    .line 56
    move-wide/from16 p6, p2

    .line 57
    .line 58
    move-object p2, p4

    .line 59
    move-object p3, p5

    .line 60
    move-wide p4, v1

    .line 61
    invoke-direct/range {p2 .. p7}, LE2/i;-><init>(Ljava/lang/String;JJ)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, p2}, LE2/m;-><init>(LE2/i;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    iput-object p1, p0, LE2/j$c;->m:LE2/m;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$c;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()LD2/f;
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$c;->m:LE2/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LE2/i;
    .locals 1

    .line 1
    iget-object v0, p0, LE2/j$c;->l:LE2/i;

    .line 2
    .line 3
    return-object v0
.end method
