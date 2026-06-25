.class public final Ldg/F$a$a;
.super Ldg/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldg/F$a;->c(Ltg/j;Ldg/x;J)Ldg/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Ldg/x;

.field final synthetic c:J

.field final synthetic d:Ltg/j;


# direct methods
.method constructor <init>(Ldg/x;JLtg/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldg/F$a$a;->b:Ldg/x;

    .line 2
    .line 3
    iput-wide p2, p0, Ldg/F$a$a;->c:J

    .line 4
    .line 5
    iput-object p4, p0, Ldg/F$a$a;->d:Ltg/j;

    .line 6
    .line 7
    invoke-direct {p0}, Ldg/F;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldg/F$a$a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public j()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/F$a$a;->b:Ldg/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/F$a$a;->d:Ltg/j;

    .line 2
    .line 3
    return-object v0
.end method
