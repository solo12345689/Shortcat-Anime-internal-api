.class public final Lia/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lia/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lia/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lia/d$a;->a:Lia/d$a;

    .line 5
    .line 6
    iput-object v0, p0, Lia/a;->b:Lia/d$a;

    .line 7
    .line 8
    return-void
.end method

.method public static b()Lia/a;
    .locals 1

    .line 1
    new-instance v0, Lia/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lia/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Lia/d;
    .locals 3

    .line 1
    new-instance v0, Lia/a$a;

    .line 2
    .line 3
    iget v1, p0, Lia/a;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lia/a;->b:Lia/d$a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lia/a$a;-><init>(ILia/d$a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public c(I)Lia/a;
    .locals 0

    .line 1
    iput p1, p0, Lia/a;->a:I

    .line 2
    .line 3
    return-object p0
.end method
