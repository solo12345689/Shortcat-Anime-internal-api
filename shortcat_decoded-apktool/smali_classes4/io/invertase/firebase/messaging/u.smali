.class public abstract Lio/invertase/firebase/messaging/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/Exception;)LPd/b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "messageId"

    .line 6
    .line 7
    invoke-interface {v0, v1, p0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p0, "error"

    .line 11
    .line 12
    invoke-static {p1}, LPd/m;->b(Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {v0, p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, LPd/b;

    .line 20
    .line 21
    const-string p1, "messaging_message_send_error"

    .line 22
    .line 23
    invoke-direct {p0, p1, v0}, LPd/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public static b(Ljava/lang/String;)LPd/b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "messageId"

    .line 6
    .line 7
    invoke-interface {v0, v1, p0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, LPd/b;

    .line 11
    .line 12
    const-string v1, "messaging_message_sent"

    .line 13
    .line 14
    invoke-direct {p0, v1, v0}, LPd/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static c()LPd/b;
    .locals 3

    .line 1
    new-instance v0, LPd/b;

    .line 2
    .line 3
    const-string v1, "messaging_message_deleted"

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, LPd/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static d(Ljava/lang/String;)LPd/b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "token"

    .line 6
    .line 7
    invoke-interface {v0, v1, p0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, LPd/b;

    .line 11
    .line 12
    const-string v1, "messaging_token_refresh"

    .line 13
    .line 14
    invoke-direct {p0, v1, v0}, LPd/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method static e(Lcom/facebook/react/bridge/ReadableMap;)Lcom/google/firebase/messaging/W;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/W$b;

    .line 2
    .line 3
    const-string v1, "to"

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/google/firebase/messaging/W$b;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "ttl"

    .line 13
    .line 14
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/W$b;->f(I)Lcom/google/firebase/messaging/W$b;

    .line 25
    .line 26
    .line 27
    :cond_0
    const-string v1, "messageId"

    .line 28
    .line 29
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/W$b;->d(Ljava/lang/String;)Lcom/google/firebase/messaging/W$b;

    .line 40
    .line 41
    .line 42
    :cond_1
    const-string v1, "messageType"

    .line 43
    .line 44
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/W$b;->e(Ljava/lang/String;)Lcom/google/firebase/messaging/W$b;

    .line 55
    .line 56
    .line 57
    :cond_2
    const-string v1, "collapseKey"

    .line 58
    .line 59
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/W$b;->c(Ljava/lang/String;)Lcom/google/firebase/messaging/W$b;

    .line 70
    .line 71
    .line 72
    :cond_3
    const-string v1, "data"

    .line 73
    .line 74
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :goto_0
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {p0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v0, v2, v3}, Lcom/google/firebase/messaging/W$b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/messaging/W$b;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W$b;->b()Lcom/google/firebase/messaging/W;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public static f(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Boolean;)LPd/b;
    .locals 1

    .line 1
    new-instance v0, LPd/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p1, "messaging_notification_opened"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "messaging_message_received"

    .line 13
    .line 14
    :goto_0
    invoke-direct {v0, p1, p0}, LPd/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method static g(Lcom/google/firebase/messaging/W$c;)Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->w()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-string v2, "title"

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->w()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->y()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v2, "titleLocKey"

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->y()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->x()[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->x()[Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->fromJavaArgs([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "titleLocArgs"

    .line 54
    .line 55
    invoke-interface {v0, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    const-string v2, "body"

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->a()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->c()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    const-string v2, "bodyLocKey"

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->c()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->b()[Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->b()[Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->fromJavaArgs([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v3, "bodyLocArgs"

    .line 103
    .line 104
    invoke-interface {v0, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->d()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_6

    .line 112
    .line 113
    const-string v2, "channelId"

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->d()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->e()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-eqz v2, :cond_7

    .line 127
    .line 128
    const-string v2, "clickAction"

    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->e()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->f()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    const-string v2, "color"

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->f()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->k()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-eqz v2, :cond_9

    .line 157
    .line 158
    const-string v2, "smallIcon"

    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->k()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_9
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->l()Landroid/net/Uri;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-eqz v2, :cond_a

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->l()Landroid/net/Uri;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const-string v3, "imageUrl"

    .line 182
    .line 183
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_a
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->n()Landroid/net/Uri;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-eqz v2, :cond_b

    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->n()Landroid/net/Uri;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v3, "link"

    .line 201
    .line 202
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_b
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->q()Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-eqz v2, :cond_c

    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->q()Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    const-string v3, "count"

    .line 220
    .line 221
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 222
    .line 223
    .line 224
    :cond_c
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->r()Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-eqz v2, :cond_d

    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->r()Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    const-string v3, "priority"

    .line 239
    .line 240
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 241
    .line 242
    .line 243
    :cond_d
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->s()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-eqz v2, :cond_e

    .line 248
    .line 249
    const-string v2, "sound"

    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->s()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :cond_e
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->v()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    if-eqz v2, :cond_f

    .line 263
    .line 264
    const-string v2, "ticker"

    .line 265
    .line 266
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->v()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :cond_f
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->A()Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    if-eqz v2, :cond_10

    .line 278
    .line 279
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W$c;->A()Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    const-string v2, "visibility"

    .line 288
    .line 289
    invoke-interface {v1, v2, p0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 290
    .line 291
    .line 292
    :cond_10
    const-string p0, "android"

    .line 293
    .line 294
    invoke-interface {v0, p0, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 295
    .line 296
    .line 297
    return-object v0
.end method

.method public static h(Lcom/google/firebase/messaging/W;Ljava/lang/Boolean;)LPd/b;
    .locals 1

    .line 1
    new-instance v0, LPd/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p1, "messaging_notification_opened"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "messaging_message_received"

    .line 13
    .line 14
    :goto_0
    invoke-static {p0}, Lio/invertase/firebase/messaging/u;->i(Lcom/google/firebase/messaging/W;)Lcom/facebook/react/bridge/WritableMap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p1, p0}, LPd/b;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method static i(Lcom/google/firebase/messaging/W;)Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-string v2, "collapseKey"

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->c()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->e()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v2, "from"

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->y()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const-string v2, "to"

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->y()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->f()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    const-string v2, "messageId"

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->f()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->l()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    const-string v2, "messageType"

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->l()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v0, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->d()Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-lez v2, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->d()Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Ljava/util/Map$Entry;

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Ljava/lang/String;

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {v1, v4, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    const-string v2, "data"

    .line 135
    .line 136
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->z()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    int-to-double v1, v1

    .line 144
    const-string v3, "ttl"

    .line 145
    .line 146
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->x()J

    .line 150
    .line 151
    .line 152
    move-result-wide v1

    .line 153
    long-to-double v1, v1

    .line 154
    const-string v3, "sentTime"

    .line 155
    .line 156
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 157
    .line 158
    .line 159
    const-string v1, "priority"

    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->w()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 166
    .line 167
    .line 168
    const-string v1, "originalPriority"

    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->s()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-eqz v1, :cond_6

    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lio/invertase/firebase/messaging/u;->g(Lcom/google/firebase/messaging/W$c;)Lcom/facebook/react/bridge/WritableMap;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    const-string v1, "notification"

    .line 192
    .line 193
    invoke-interface {v0, v1, p0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 194
    .line 195
    .line 196
    :cond_6
    return-object v0
.end method
