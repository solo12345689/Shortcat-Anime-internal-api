.class final Lcom/android/billingclient/api/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:I

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/billingclient/api/H;->c:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/billingclient/api/H;->d:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/billingclient/api/H;->a:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/android/billingclient/api/H;->b:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/billingclient/api/H;->c:I

    .line 2
    .line 3
    return v0
.end method

.method final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/H;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/H;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/H;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
